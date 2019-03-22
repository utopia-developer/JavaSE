package Assignment.Assignment5.model;

public class Song {
    private String id;
    private String name;
    private String singer;

    public Song() {

    }

    public Song(String id, String name, String singer) {
        this.setId(id);
        this.setName(name);
        this.setSinger(singer);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "歌曲信息：" +
                "id为" + this.getId() +
                ", 歌曲名称为：" + this.getName() +
                ", 演唱者为：" + this.getSinger();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (getId() != null ? !getId().equals(song.getId()) : song.getId() != null) return false;
        if (getName() != null ? !getName().equals(song.getName()) : song.getName() != null) return false;
        return getSinger() != null ? getSinger().equals(song.getSinger()) : song.getSinger() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSinger() != null ? getSinger().hashCode() : 0);
        return result;
    }
}
