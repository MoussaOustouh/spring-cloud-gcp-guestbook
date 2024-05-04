package com.example.guestbook;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface GuestbookMessageRepository extends
    PagingAndSortingRepository<GuestbookMessage, String> {

		List<GuestbookMessage> findByName(String name);
}

