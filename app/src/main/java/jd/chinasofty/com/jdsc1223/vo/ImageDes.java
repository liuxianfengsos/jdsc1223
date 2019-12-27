package jd.chinasofty.com.jdsc1223.vo;

public class ImageDes {
    private int imageId;
    private String title;
    private String name;
    public ImageDes() {

    }
    public ImageDes(int imageId, String title, String name) {
        this.imageId = imageId;
        this.title = title;
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ImageDes{" + "imageId=" + imageId + ", title='" + title + '\'' + ", name='" + name + '\'' + '}';
    }
}
