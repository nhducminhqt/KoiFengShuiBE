package org.example.kfs.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fengshuisystem.demo.entity.enums.Request;
import jakarta.persistence.*;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.security.core.context.SecurityContextHolder;

import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Destiny
@Table(name = "consultation_result")
public class ConsultationResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consultation_result_id", nullable = false)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn
    @JsonBackReference
    private ConsultationRequest request;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn
    private ConsultationRequestDetail requestDetail;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    @JoinColumn(name = "account_id")
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "consultation_category_id")
    private ConsultationCategory consultationCategory;

    @Column(name = "consultation_date")
    private Instant consultationDate;

    @Size(max = 500)
    @Nationalized
    @Column(name = "consultant_name", length = 500)
    private String consultantName;

    @NotNull
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Request status = Request.PENDING;

    @NotNull
    @NotBlank
    @Nationalized
    @Column(name = "description", nullable = false, length = 4000)
    private String description;

    @SuppressWarnings("unused")
    @AssertTrue(message = "The description must contain at least 10 words.")
    public boolean isDescriptionValid() {
        if (description == null) {
            return false;
        }
        // Tách `description` thành các từ bằng regex
        String[] words = description.trim().split("\\s+");
        return words.length >= 10;
    }

    @Column(name = "created_date")
    private Instant createdDate;

    @Size(max = 300)
    @Column(name = "created_by", length = 300)
    private String createdBy;

    @Column(name = "updated_date")
    private Instant updatedDate;

    @Size(max = 300)
    @Column(name = "updated_by", length = 300)
    private String updatedBy;

    @OneToMany(mappedBy = "consultationResult", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private Set<ConsultationAnimal> consultationAnimals = new LinkedHashSet<>();

    @OneToMany(mappedBy = "consultationResult", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH})
    private Set<ConsultationShelter> consultationShelters = new LinkedHashSet<>();

    @PrePersist
    protected void onCreate() {
        Instant now = Instant.now();
        this.createdDate = now;
        this.updatedDate = now;
        this.createdBy = SecurityContextHolder.getContext().getAuthentication().getName();
        this.updatedBy = this.createdBy;
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedDate = Instant.now();
        this.updatedBy = SecurityContextHolder.getContext().getAuthentication().getName();
    }
}

