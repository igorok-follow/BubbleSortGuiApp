import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainWindow extends JFrame {
    public MainWindow() {                //по принципам "Чистого кода в Java" в конструкторе класса не должно быть лишнего кода
        Frame();
        addComponentsOnMainFrame();
        buttonsActionListeners();
    }

    public void Frame() {               //настройка окна
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(new Dimension(800, 300));
        setVisible(true);
        setDefaultLookAndFeelDecorated(true);
    }

    private JButton button  = new JButton("1");
    private JButton button1 = new JButton("2");
    private JButton button2 = new JButton("3");
    private JButton button3 = new JButton("4");
    private JButton button4 = new JButton("5");
    private JButton button5 = new JButton("6");
    private JButton button6 = new JButton("7");
    private JButton button7 = new JButton("8");
    private JButton button8 = new JButton("9");
    private JButton buttonAccept = new JButton("Accept");
    private JTextArea textArea = new JTextArea(4 ,40);
    private JScrollPane scrollPane;
    private String string = "";     //данная переменная будет использована для видимости процесса работы приложения на JTextArea
    public ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private String arrayOutPut = "";

    public void addComponentsOnMainFrame() {
        JPanel contentPane = new JPanel();   //основная панель на которой будут находиться другие 2 панели
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.LINE_AXIS));


        JPanel paneWithNumPad = new JPanel();
        paneWithNumPad.setBackground(Color.BLACK);
        paneWithNumPad.setLayout(new GridLayout(3, 3, 1, 1));
        paneWithNumPad.add(button);
        paneWithNumPad.add(button1);
        paneWithNumPad.add(button2);
        paneWithNumPad.add(button3);
        paneWithNumPad.add(button4);
        paneWithNumPad.add(button5);
        paneWithNumPad.add(button6);
        paneWithNumPad.add(button7);
        paneWithNumPad.add(button8);

        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setText("Enter on NumPad sequence of numbers which\n you want to sort \n ===================================>");

        scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(100, 150));


        JPanel paneWithTextArea = new JPanel();
        paneWithTextArea.setLayout(new GridLayout(2, 1, 5, 0));
        paneWithTextArea.setBackground(new Color(203, 203, 203));
        paneWithTextArea.add(scrollPane);
        paneWithTextArea.add(buttonAccept);


        contentPane.add(paneWithTextArea);             //добавляем панели с NumPad и с Полем ввода
        contentPane.add(paneWithNumPad);               //

        getContentPane().add(contentPane);
        contentPane.revalidate();                       //данная строка решает проблему с отображением компонентов (без неё, до изменения 
    }                                                   //ширины или высоты окна, ничего на окне не появляется)

    public void buttonsActionListeners() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "1";
                textArea.setText(string);
                arrayList.add(1);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "2";
                textArea.setText(string);
                arrayList.add(2);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "3";
                textArea.setText(string);
                arrayList.add(3);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "4";
                textArea.setText(string);
                arrayList.add(4);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "5";
                textArea.setText(string);
                arrayList.add(5);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "6";
                textArea.setText(string);
                arrayList.add(6);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "7";
                textArea.setText(string);
                arrayList.add(7);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "8";
                textArea.setText(string);
                arrayList.add(8);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string += "9";
                textArea.setText(string);
                arrayList.add(9);
            }
        });
        buttonAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                string = "";
                textArea.setText(string);
                BubbleSorting();
                textArea.setText(arrayOutPut);
            }
        });

    }

    public void BubbleSorting() {
        int j;
        boolean initializeWorkOfWhile = true;   // устанавливаем наш флаг в true для первого прохода по массиву
        int temp;   // вспомогательная переменная

        while (initializeWorkOfWhile) {
            initializeWorkOfWhile = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (j = 0; j < arrayList.size() - 1; j++)
                if (arrayList.get(j) > arrayList.get(j + 1)) { // измените на > для сортировки по возрастанию
                    temp = arrayList.get(j);         // меняем элементы местами
//                    arrayList.get(j) = arrayList.get(j + 1);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);

                    initializeWorkOfWhile = true;  // true означает, что замена местами была проведена
                }
        }

        for (int i = 0; i < arrayList.size(); i++) {            //Вывод отсортированного массива в текстовое поле
            arrayOutPut += arrayList.get(i).toString();
        }

        return;
    }
}
