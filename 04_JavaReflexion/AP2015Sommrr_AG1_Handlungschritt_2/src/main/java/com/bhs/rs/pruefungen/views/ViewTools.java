package com.bhs.rs.pruefungen.Views;


import org.apache.commons.io.input.CloseShieldInputStream;
import org.apache.commons.lang.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.UUID;


/**
 * Created by JAbanto on 15.01.2018.
 */
public final class ViewTools {

    private static final String ANSI_CLS = "\u001b[2J";

    private static final String ANSI_HOME = "\u001b[H";

    private ViewTools() {
    }

    /**
     * Reads input until return/enter was hit and returns a trimmed version or the default.
     *
     * @param prompt       The prompt text
     * @param defaultValue The default value
     * @return Trimmed version of the input or null if there was an error.
     */
    public static String readInput(String prompt, String defaultValue) {
        String input = readInput(prompt + " (default: '" + getShortened(defaultValue, 20) + "')");
        if (StringUtils.isEmpty(input)) {
            input = defaultValue;
        }
        return input;
    }

    /**
     * Gets a shortened literal without linebreaks. All excess will be truncated by length-3 and "..." will be added.
     *
     * @param text   text
     * @param length maximum length
     * @return shortened text
     */
    private static String getShortened(String text, int length) {
        String result = text.trim().replaceAll("(\\n|\\r)", "");
        if (result.length() > length) {
            result = result.substring(0, length > 10 ? length - 3 : length) + "...";
        }
        return result;
    }

    /**
     * Reads input until return/enter was hit and returns a trimmed version. Prompts the user.
     *
     * @param prompt Prompt to be displayed.
     * @return Trimmed version of the input or null if there was an error.
     */
    public static String readInput(String prompt) {

        String retVal = "";

        if (prompt != null) {
            outputWithoutNewLine(prompt + " > ");
        }

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new CloseShieldInputStream(System.in)))) {
            retVal = br.readLine().trim();
        } catch (IOException e) {
            // swallow exception
        }

        return retVal;
    }

    /**
     * Clears the terminal screen.
     */
    public static void clearScreen() {
        System.out.print(ANSI_CLS + ANSI_HOME);
        System.out.flush();
    }

    /**
     * Waits for the user to hit return.
     */
    public static void waitForReturn() {
        readInput("\n Press [ENTER] to chose another Exercise");
    }

    /**
     * Outputs a text to standard out.
     *
     * @param text Text to be displayed.
     */
    public static void output(String text) {
        outputWithoutNewLine(text + "\n");
    }

    /**
     * Outputs a text to standard out.
     *
     * @param text Text to be displayed.
     */
    private static void outputWithoutNewLine(String text) {
        System.out.print(text);
    }

    /**
     * Prints a separator.
     */
    public static void separator() {
        for (int i = 0; i < 60; i++) {
            outputWithoutNewLine("-");
        }
        newLine();
    }

    /**
     * Prints a separator.
     *
     * @param prefix A prefix.
     */
    public static void separator(String prefix) {
        StringBuilder sb = new StringBuilder(prefix);
        sb.append(" ");
        for (int i = prefix.length() + 1; i < 60; i++) {
            sb.append("-");
        }
        output(sb.toString());
    }

    /**
     * Outputs a newline.
     */
    public static void newLine() {
        System.out.println();
    }

    /**
     * Outputs a header.
     *
     * @param header A header.
     */
    public static void outputHeader(String header) {
        separator();
        output(header);
        separator();
    }

    /**
     * Reads a boolean value.
     *
     * @param prompt       Prompt to display.
     * @param defaultValue Default value if input is empty.
     * @return A Boolean.
     */
    @SuppressWarnings("BooleanMethodNameMustStartWithQuestion")
    public static boolean readBoolean(String prompt, Boolean defaultValue) {
        String booleanString = readInput(prompt, defaultValue.toString());
        return Boolean.valueOf(booleanString);
    }

    /**
     * Reads a long value.
     *
     * @param prompt       Prompt do display.
     * @param defaultValue Default value if input is empty.
     * @return A Long.
     */
    public static long readLong(String prompt, String defaultValue) {
        String longString = readInput(prompt, defaultValue);
        return Long.valueOf(longString);
    }

    /**
     * Reads an {@link UUID}.
     *
     * @param prompt       Prompt to display.
     * @param defaultValue Default value if input is empty.
     * @return A {@link UUID}.
     */
    public static UUID readUuid(String prompt, String defaultValue) {
        String uuidString = readInput(prompt, defaultValue);
        return UUID.fromString(uuidString);
    }





}
