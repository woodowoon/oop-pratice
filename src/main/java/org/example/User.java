package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        String randomPassword = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자이상 12자 이하여야한다.
         */
        if(randomPassword.length() >= 8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }
}
