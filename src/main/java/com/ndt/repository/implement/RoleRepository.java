package com.ndt.repository.implement;

import com.ndt.repository.IRoleRepository;
import com.ndt.models.Role;
import org.springframework.stereotype.Repository;

@Repository
public class RoleRepository extends GenericRepository<Role> implements IRoleRepository {
}
