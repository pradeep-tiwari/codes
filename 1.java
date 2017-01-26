ackage com.lambdas.introduction;

/**
 *
 * @author pradeep
 */
public class UserModel {

    private int id;
    private boolean read;
    private boolean write;
    private boolean delete;

    public UserModel(int id, boolean read, boolean write, boolean delete) {
        this.id = id;
        this.read = read;
        this.write = write;
        this.delete = delete;
    }

    public boolean canRead() {
        return read;
    }

    public boolean canWrite() {
        return write;
    }

    public boolean canDelete() {
        return delete;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", read=" + read + ", write=" + write + ", delete=" + delete + '}';
    }

}
