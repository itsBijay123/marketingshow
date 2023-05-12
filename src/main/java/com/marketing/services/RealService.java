package com.marketing.services;

import java.util.List;

import com.marketing.entities.Real;

public interface RealService {
public void saveOneReal(Real real);

public List<Real> getAllReals();

public void deleteReal(long id);

public Real getRealById(long id);
}
