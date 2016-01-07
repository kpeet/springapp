package com.kpeet.springapp.service;

import java.io.Serializable;
import java.util.List;

import com.kpeet.springapp.domain.Location;

public interface LocationManager  extends Serializable {
    
    public List<Location> getLocations();
}
