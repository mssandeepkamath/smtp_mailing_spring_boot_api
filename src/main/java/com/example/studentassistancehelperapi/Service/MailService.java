package com.example.studentassistancehelperapi.Service;

import com.example.studentassistancehelperapi.Model.Mail;
import com.example.studentassistancehelperapi.Model.Response;

import java.util.Map;

public interface MailService {

     Response sendEmail(Mail request, Map<String, Object> model,String to);

}
