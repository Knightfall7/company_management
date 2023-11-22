package org.example.Employees;

import org.example.Website;

public class CloudDeveloper extends Developer {

    public CloudDeveloper(String name, String programmingLanguage) {
        super(name, programmingLanguage);

    }

    public void FixWebsite(Website website) {
        website.fix();
    }
}
