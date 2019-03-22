package Assignment.Assignment5.model;

import java.util.HashMap;
import java.util.Map;

public class PlayListCollection {
    private Map<String, PlayList> map = new HashMap<>();

    public PlayListCollection() {

    }

    public Map<String, PlayList> getMap() {
        return map;
    }

    public void setMap(Map<String, PlayList> map) {
        this.map = map;
    }

    /**
     * 添加播放列表
     *
     * @param playList 待添加的播放列表
     */
    public void addPlayList(PlayList playList) {

    }

    /**
     * 删除播放列表
     *
     * @param playList 待删除的播放列表
     */
    public void deletePlayList(PlayList playList) {

    }

    /**
     * 通过名称查询
     *
     * @param playListName 要查询的播放列表的名称
     * @return 查询到的播放列表
     */
    public PlayList searchPlayListByName(String playListName) {
        return new PlayList();
    }

    /**
     * 显示所有播放列表名称
     */
    public void displayPlayListName() {

    }
}
