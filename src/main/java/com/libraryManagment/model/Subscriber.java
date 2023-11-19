package com.libraryManagment.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Subscriber  extends User{
    private int surbscriberId;

    public Subscriber(int userId, String UserName) {
        super(userId, UserName);
    }
}
