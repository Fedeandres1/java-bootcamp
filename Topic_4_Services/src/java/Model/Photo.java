/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * this class contais the likes
 *
 * @author Frederic
 */
public class Photo {

    private int like = 0;

    public Photo() {
    }

    public int getLike() {
        return like;
    }

    public void incrementLikes() {
        like++;

    }

    public void setLike(int like) {
        this.like = like;
    }

}
