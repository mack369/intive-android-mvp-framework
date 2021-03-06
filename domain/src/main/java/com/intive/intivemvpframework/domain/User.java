/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intive.intivemvpframework.domain;

/**
 * Class that represents a User in the domain layer.
 */
public class User {

    private final int userId;

    private String coverUrl;

    private String fullName;

    private String email;

    private String description;

    private int followers;

    public User(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("***** User Details *****\n");
        stringBuilder.append("id=" + this.getUserId() + "\n");
        stringBuilder.append("cover url=" + this.getCoverUrl() + "\n");
        stringBuilder.append("fullname=" + this.getFullName() + "\n");
        stringBuilder.append("email=" + this.getEmail() + "\n");
        stringBuilder.append("description=" + this.getDescription() + "\n");
        stringBuilder.append("followers=" + this.getFollowers() + "\n");
        stringBuilder.append("*******************************");

        return stringBuilder.toString();
    }

    public int getUserId() {
        return userId;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public int getFollowers() {
        return followers;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }
}
