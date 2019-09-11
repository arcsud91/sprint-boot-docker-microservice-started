package com.chatiya.util;

import com.google.common.base.Strings;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CryptoUtil {

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public String hashPassword(String password) {
        if (password != null && !Strings.isNullOrEmpty(password)) {
            return bCryptPasswordEncoder.encode(password);
        }
        return null;
    }

    public Boolean verifyPassword(String rawPass, String encryptedPass) {
        if (rawPass != null && !Strings.isNullOrEmpty(rawPass)) {
            return bCryptPasswordEncoder.matches(rawPass, encryptedPass);
        }
        return false;
    }
}
