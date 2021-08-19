package net.mediascope.testmsproject.service;

import net.mediascope.testmsproject.dtos.PostmanResponseDTO;

public interface PostmanService {

    PostmanResponseDTO getResponseFromPostman(String foo1, String foo2);

}
