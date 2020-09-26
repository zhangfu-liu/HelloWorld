package CollectionText;

/**
 * @Author AT-zfc
 * @Since 2020-05-11 16:39
 */
public class Movie {
    public Movie() {
    }

    private String name;//电影名称
    private String type;//电影种类
    private  int donny;//电影人气

    @Override
    public String toString() {
        return "电影名称"+name+"\n电影类型"+type+"\n电影人气";
    }

    public String getName() {
        return name;
    }

    public Movie setName(String name) {
        this.name = name;
        return this;
    }

    public String getType() {
        return type;
    }

    public Movie setType(String type) {
        this.type = type;
        return this;
    }

    public int getDonny() {
        return donny;
    }

    public Movie setDonny(int donny) {
        this.donny = donny;
        return this;
    }

    public Movie(String name, String type, int donny) {
        this.name = name;
        this.type = type;
        this.donny = donny;
    }
}
