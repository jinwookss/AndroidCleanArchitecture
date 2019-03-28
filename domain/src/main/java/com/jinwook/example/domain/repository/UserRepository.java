package com.jinwook.example.domain.repository;

import com.android.example.entity.User;

import java.util.List;

import io.reactivex.Observable;

public interface UserRepository {

    Observable<User> user(final int userId);

    Observable<List<User>> users();
}
