package com.library.librarymgmt.utils;

import com.library.librarymgmt.request.LibraryBookEntryRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogUtils {

    public void loggerImpl(String methodName, LibraryBookEntryRequest request, String id){

        log.info("methodName: {} request: {} id: {}",methodName,request,id);
    }
}
