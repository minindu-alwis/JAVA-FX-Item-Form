package org.example.DateBase;

public class DBConnection {

    private static DBConnection Instance;

        private DBConnection(){

        }

        public static DBConnection getInstance(){
            if(Instance == null){
                return Instance=new DBConnection();
            }
            return Instance;
        }
}
