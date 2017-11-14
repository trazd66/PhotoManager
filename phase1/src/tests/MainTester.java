package tests;

import backend.BiDirectionalHashMap;
import backend.Picture;
import backend.Tag;

public class MainTester {
    public static void main(String[] args){
        BiDirectionalHashMap<Picture, Tag> repo = new BiDirectionalHashMap<>();
        Picture picture = new Picture("C:\\Users\\wasd.png");
        Tag tag1 = new Tag("Dog");
        Tag tag2 = new Tag("Cat");
        repo.addKeyWithValue(picture, tag1);
        repo.addValueToKey(picture, tag2);

        Picture picture2 = new Picture("");

        System.out.println(repo);

        repo.deleteKey(picture);
        System.out.println(repo);
    }
}