package com.mateacademy;

public class YoutubeCommentsApp {
    public static void main(String[] args) {
        YoutubeCommentsParser parser = new YoutubeCommentsParser();
        parser.init();
        parser.getCommentsFromVideos("yb5Vk6Hw08U");
        for (YoutubeVideo video : parser.getListOfVideos()) {
            for (Comment comment : video.getComments()) {
                System.out.println("Author: " + comment.getAuthor());
                System.out.println("Comment: " +comment.getCommentText());
                System.out.println("Upload date: " + comment.getUploadDate());
                System.out.println("Likes: " + comment.getLikes());
                System.out.println("Edited: " + comment.isEdited());
                System.out.println("----------------------------------------");
            }
        }
    }
}
