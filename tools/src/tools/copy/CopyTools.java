package tools.copy;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 复制多个文件内容到另一个文件
 */
public class CopyTools {

    public static void copy(String[] sourceNames, String targetFileName) {
        Vector<InputStream> vector = new Vector<>();

        for (int i = 0; i < sourceNames.length; i++) {
            try {
                InputStream in = new FileInputStream(sourceNames[i]);
                vector.add(in);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        Enumeration<InputStream> enumeration = vector.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);

        try {
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetFileName));
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = sequenceInputStream.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
            bos.close();
            sequenceInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
