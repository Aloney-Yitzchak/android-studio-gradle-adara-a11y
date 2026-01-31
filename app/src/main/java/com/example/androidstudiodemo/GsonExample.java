package com.example.androidstudiodemo;

// TODO: הוסף import לGson כאן


/**
 * דוגמה פשוטה לשימוש בספריית Gson
 * Gson עוזר לנו להמיר אובייקטים ל-JSON ולהיפך
 */
public class GsonExample {
    
    /**
     * מחלקה פשוטה שמייצגת משתמש
     */
    static class User {
        String name;
        int age;
        String city;
        
        User(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }
    
    public static void main(String[] args) {
        // TODO: צור אובייקט Gson
        // Gson gson = new Gson();
        
        // יצירת אובייקט User
        User user = new User("דני", 17, "תל אביב");
        
        // TODO: המר את האובייקט ל-JSON והדפס אותו
        // String json = gson.toJson(user);
        // System.out.println("JSON: " + json);
        
        
        // TODO (בונוס): נסה להמיר JSON חזרה לאובייקט
        // String jsonString = "{\"name\":\"שרה\",\"age\":16,\"city\":\"ירושלים\"}";
        // User newUser = gson.fromJson(jsonString, User.class);
        // System.out.println("Name: " + newUser.name);
    }
}
