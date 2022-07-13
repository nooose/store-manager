package com.noose.storemanager.domain.member;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@EqualsAndHashCode
@NoArgsConstructor
public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("^01([0|1|6|7|8|9])-?(\\d{3,4})-?(\\d{4})$");
        Matcher matcher = pattern.matcher(phoneNumber);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("올바른 휴대폰 번호를 입력해주세요");
        }

        this.phoneNumber = phoneNumber;
    }
}
