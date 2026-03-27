package gui;

import model.Book;
import service.LibraryService;

import javax.swing.*;
import java.awt.*;

public class LibraryGUI extends JFrame {

    private LibraryService library = new LibraryService();
    private JTextArea displayArea;
    private JTextField idField, titleField, authorField;

    public LibraryGUI() {
        setTitle("Library Management System");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel(new GridLayout(4, 2));

        panel.add(new JLabel("Book ID:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Title:"));
        titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Author:"));
        authorField = new JTextField();
        panel.add(authorField);

        JButton addBtn = new JButton("Add Book");
        addBtn.addActionListener(e -> addBook());
        panel.add(addBtn);

        JButton showBtn = new JButton("Show Books");
        showBtn.addActionListener(e -> showBooks());
        panel.add(showBtn);

        add(panel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        JPanel bottom = new JPanel();

        JButton issueBtn = new JButton("Issue Book");
        issueBtn.addActionListener(e -> issueBook());
        bottom.add(issueBtn);

        JButton returnBtn = new JButton("Return Book");
        returnBtn.addActionListener(e -> returnBook());
        bottom.add(returnBtn);

        add(bottom, BorderLayout.SOUTH);
    }

    private void addBook() {
        try {
            int id = Integer.parseInt(idField.getText());
            String title = titleField.getText();
            String author = authorField.getText();

            library.addBook(new Book(id, title, author));
            displayArea.setText("Book Added!\n");
        } catch (Exception e) {
            displayArea.setText("Error!");
        }
    }

    private void showBooks() {
        displayArea.setText("");
        for (Book b : library.getBooks()) {
            displayArea.append(
                b.getId() + " - " + b.getTitle() + " - " + b.getAuthor() +
                (b.isIssued() ? " [Issued]\n" : " [Available]\n")
            );
        }
    }

    private void issueBook() {
        int id = Integer.parseInt(idField.getText());
        library.issueBook(id);
        showBooks();
    }

    private void returnBook() {
        int id = Integer.parseInt(idField.getText());
        library.returnBook(id);
        showBooks();
    }
}