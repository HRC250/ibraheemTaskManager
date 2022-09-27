package gha.bahaa.ibraheemtaskmanager.data;

import java.security.Key;

public class Mahammh {

    private String Key;
    private String Title;
    private String Subject;
    private int important;
    private String owner;

    public Mahammh()
    {

    }

    public String getKey() {
        return Key;
    }

    public int getImportant() {
        return important;
    }

    public String getOwner() {
        return owner;
    }

    public String getSubject() {
        return Subject;
    }

    public String getTitle() {
        return Title;

    }

    public void setKey(String key) {
        Key = key;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public void setImportant(int important) {
        this.important = important;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Mahammh{" +
                "Key='" + Key + '\'' +
                ", Title='" + Title + '\'' +
                ", Subject='" + Subject + '\'' +
                ", important=" + important +
                ", owner='" + owner + '\'' +
                '}';
    }
}
