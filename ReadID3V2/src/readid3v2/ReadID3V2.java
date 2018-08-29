import java.io.*;

public class ReadID3V2 {
    public static void main(String[] args){
        try{
            // fileok beolvasása sorba majd adatok be olvasás és át nevezés
            File folder = new File(".");
            File[] contents = folder.listFiles();
            for(int i=0;i<contents.length;i++){
                String name = contents[i].getName();
            if(name.indexOf(".mp3") == -1){
                //System.out.println("Eddig ez jó!(Rossz file) :" + name + " - " + contents[i]);
                continue;
            }
            else
            {
               //System.out.println("Jó file: " + name + " - " + contents[i]);
            }
            FileInputStream file = new FileInputStream(contents[i]);
            int size = (int)contents[i].length();
            file.skip(size - 128);
            byte[] last128 = new byte[128];
            file.read(last128);
            String id3 = new String(last128);
            String tag = id3.substring(0,3);
            if(tag.equals("TAG")){
                // ID3 információk az MP3-ból
                String title = id3.substring(3, 32);
                title = title.trim();
                System.out.println("Title: " + id3.substring(3, 32));
                String artist = id3.substring(33, 62);
                artist = artist.trim();
                System.out.println("Artist: " + id3.substring(33, 62));
                String album = id3.substring(63, 91);
                album = album.trim();
                System.out.println("Album: " + id3.substring(63, 91));
                System.out.println("Year: " + id3.substring(93, 97));
                file.close();
                //Create new filename to use
                StringBuffer newName = new StringBuffer();
                newName.append(artist);
                if(title.length()>0){
                    newName.append(" - " + title);
                }
                if(album.length()>0){
                    newName.append(" (" + album + ")");
                }
                File newFile = new File(newName.toString() + ".mp3");
                //Rename file and displa it new name
                contents[i].renameTo(newFile);
                System.out.println(newFile.getName());
            }else{
                System.out.println(name + " does not contain" + " ID3 info.");
                file.close();
                }
            }
        }catch(Exception e){
            System.out.println("Error -- " + e.toString());
        }
    }
}
