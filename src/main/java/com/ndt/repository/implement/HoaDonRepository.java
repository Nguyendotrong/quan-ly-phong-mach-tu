package com.ndt.repository.implement;

import com.ndt.repository.IHoaDonRepository;
import com.ndt.models.HoaDon;
import org.springframework.stereotype.Repository;

@Repository
public class HoaDonRepository extends GenericRepository<HoaDon> implements IHoaDonRepository {
}
