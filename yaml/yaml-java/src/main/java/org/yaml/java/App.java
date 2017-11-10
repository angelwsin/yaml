package org.yaml.java;

import org.yaml.snakeyaml.Yaml;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Yaml yaml = new Yaml();
        User user = new User();
        user.setPassword("xxx");
        user.setUserName("xiaoming");
        System.out.println(yaml.dump(user));
    }
}
