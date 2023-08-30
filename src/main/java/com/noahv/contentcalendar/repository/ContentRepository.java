package com.noahv.contentcalendar.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import com.noahv.contentcalendar.model.Content;
import com.noahv.contentcalendar.model.Status;

public interface ContentRepository extends ListCrudRepository<Content, Integer> {

    List<Content> findAllByTitleContains(String keyword);

    @Query("""
            SELECT * FROM Content
            where status = :status
            """)
    List<Content> listByStatus(@Param("status") String status);

}
