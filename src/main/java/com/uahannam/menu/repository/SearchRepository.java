package com.uahannam.menu.repository;

import com.uahannam.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRepository extends JpaRepository<Menu, Long> {
}
