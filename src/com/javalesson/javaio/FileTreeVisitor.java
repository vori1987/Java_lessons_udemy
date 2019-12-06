package com.javalesson.javaio;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FileTreeVisitor {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");
        Files.walkFileTree(path, new Visitor());

    }

    public static class Visitor extends SimpleFileVisitor<Path> {
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            renameFile(file);
            return FileVisitResult.CONTINUE;
        }

        private void renameFile(Path file) throws IOException {
            int nameCount = file.getNameCount();
            if (nameCount > 1) {
                Path start = file.subpath(0, nameCount - 1);
                Path end = file.subpath(nameCount - 1, nameCount);
                Files.move(file, Paths.get(start + File.separator + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "  " + end));
            }
        }

        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            System.out.println(dir);
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            renameFile(dir);
            return FileVisitResult.CONTINUE;
        }
    }
}
