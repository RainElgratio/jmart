package rainJmartFH;

/**
 * Write a description of class FileParser here.
 *
 * @author rain
 * @version (a version number or a date)
 */
public interface FileParser
{

    public boolean read(String content);
    Object write(String content);
    public Object newInstance(String content);

}

