package org.example.kfs.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResDTO implements Serializable {
    private String status;
    private String URL;
    private String message;

}
