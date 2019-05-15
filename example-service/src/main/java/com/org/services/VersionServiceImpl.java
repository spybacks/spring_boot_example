package com.org.services;



import com.org.model.Version;
import org.springframework.stereotype.Service;



@Service
public class VersionServiceImpl implements VersionService {


    @Override
    public Version getVersion() {

        Version version = new Version();
        version.setVersion("1.1.1");
        return version;
    }




}
