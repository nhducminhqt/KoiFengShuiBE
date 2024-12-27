package org.example.kfs.repository;

import com.fengshuisystem.demo.entity.PostCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostCategoryRepository extends JpaRepository<PostCategory, Integer> {
     boolean existsByPostCategoryName(String postCategoryName);

}
