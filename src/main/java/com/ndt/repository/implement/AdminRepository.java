package com.ndt.repository.implement;

import com.ndt.repository.IAdminRepository;
import com.ndt.models.Admin;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository extends GenericRepository<Admin> implements IAdminRepository {
}
