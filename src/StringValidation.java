public class StringValidation {

    public static void main(String[] args) {
        String toValidate = args[0];
        System.out.println(toValidate +" is " +isUpperCase(toValidate) + " for uppercase check");
        System.out.println(toValidate +" is " +isLowerCase(toValidate) + " for lowercase check");
        System.out.println(toValidate +" is " +isPasswordStrong(toValidate) + " for password check");
    }

    public static boolean isUpperCase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowerCase(String s) {
        return s.chars().allMatch(Character::isLowerCase);
    }

    public static boolean isPasswordStrong(String s) {
        return s.chars().anyMatch(Character::isLowerCase) &&
                s.chars().anyMatch(Character::isUpperCase) &&
                s.chars().anyMatch(Character::isDigit);
    }
}
