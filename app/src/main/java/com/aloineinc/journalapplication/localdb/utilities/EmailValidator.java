/*
 * Copyright 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aloineinc.journalapplication.localdb.utilities;

/**
 * Validates the email address and provides
 * required output
 */
@SuppressWarnings("BooleanMethodIsAlwaysInverted")
public abstract class EmailValidator {

    /**
     * Validates anc checks email address if it
     * follows the email convention and returns true
     */
    public static boolean isValidEmail(String email)
    {
        String emailRegex =
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(emailRegex);
    }
}
