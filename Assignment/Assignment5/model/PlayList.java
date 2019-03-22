package Assignment.Assignment5.model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String playListName;
    private List<Song> musicList = new ArrayList<>();

    public PlayList() {

    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }

    /**
     * 将歌曲添加到播放列表
     *
     * @param song 待添加的歌曲
     */
    public void addToPlayList(Song song) {

    }

    /**
     * 显示播放列表中所有歌曲
     */
    public void displayAllSong() {

    }

    /**
     * 通过id查询歌曲的方法
     *
     * @param id 歌曲id
     */
    public Song searchSongById(String id) {
        return new Song();
    }

    /**
     * 通过名称查询歌曲的方法
     *
     * @param n 歌曲名称
     */
    public Song searchSongByName(String n) {
        return new Song();
    }

    /**
     * 修改歌曲
     * 歌曲的id不变，修改歌曲的名称或演唱者
     *
     * @param song 待修改的歌曲
     */
    public void updateSong(Song song) {

    }

    /**
     * 从播放列表删除歌曲
     *
     * @param id 待删除的歌曲id
     */
    public void deleteSong(String id) {

    }

    /**
     * 显示指定播放列表中的所有歌曲
     *
     * @param playListName
     */
    public void displayAllSong(String playListName) {

    }

    /**
     * 导出歌单
     */
    public void exportPlayList() {

    }
}
