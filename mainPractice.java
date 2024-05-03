 
public class mainPractice {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(5);
        System.out.println(st.top());

        queue q=new queue();
        q.push(7);
        q.push(9);
        q.printlist();
        System.out.println(q.front());
        q.pop();
        q.printlist();

    }
}
