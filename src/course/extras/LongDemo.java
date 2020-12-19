/*   Created by IntelliJ IDEA.
 *   Author: Raj kumar
 *   Date: 26/07/20
 *   Time: 01:00PM
 *   File: LogInDemo.java
 */

package course.extras;


import javax.swing.JOptionPane;

/**
 * This class will be used to demonstrate a simple log in action.
 */
class LogInDemo {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog(
                null,
                "username",
                "Log In : Username",
                JOptionPane.PLAIN_MESSAGE
        );
        // the password dialog shows the actual characters, can you find the code to show it as `*` ?
        String password = JOptionPane.showInputDialog(
                null,
                "password",
                "Log In : Password",
                JOptionPane.PLAIN_MESSAGE
        );

        if (username.isEmpty() || username.isBlank()) {
            JOptionPane.showMessageDialog(
                    null,
                    "username cannot be empty or blank!",
                    "wrong username",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        if (password.isEmpty() || password.isBlank()) {
            JOptionPane.showMessageDialog(
                    null,
                    "password cannot be empty or blank!",
                    "wrong username",
                    JOptionPane.ERROR_MESSAGE
            );
        }

        if (!username.isEmpty() && !password.isEmpty()) {
            // you can change the String literals for username and password below and try it out.
            if ("dbc2201".equals(username) && "passwordIsOk".equals(password)) {
                JOptionPane.showMessageDialog(
                        null,
                        "Logged In",
                        "Welcome, " + username,
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        }
    }
}