package com.tasklistie.todosinfosservice.models;

import javax.persistence.*;

@Entity
@Table(name = "favorites")
public class FavoriteEntity {

    public FavoriteEntity() {
    }

    public FavoriteEntity(Integer userId, Integer taskId) {
        this.userId = userId;
        this.taskId = taskId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "task_id")
    private Integer taskId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoriteEntity favoriteEntity = (FavoriteEntity) o;

        if (id != null ? !id.equals(favoriteEntity.id) : favoriteEntity.id != null) return false;
        if (userId != null ? !userId.equals(favoriteEntity.userId) : favoriteEntity.userId != null) return false;
        return taskId != null ? taskId.equals(favoriteEntity.taskId) : favoriteEntity.taskId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (taskId != null ? taskId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Favorite{" +
                "id=" + id +
                ", userId=" + userId +
                ", taskId=" + taskId +
                '}';
    }
}
