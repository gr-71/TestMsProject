package net.mediascope.testmsproject.service;

public interface ClientUtils {

    <T> T getData (Class<T> classType, String url);

}
