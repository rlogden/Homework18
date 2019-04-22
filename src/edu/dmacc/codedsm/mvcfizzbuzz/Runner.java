package edu.dmacc.codedsm.mvcfizzbuzz;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a username:");
        String userName = in.next();
        System.out.println("Enter a number:");
        Integer inputNumber = in.nextInt();

        MapRepository repository = new NewMapRepoImpl();
        FizzBuzzService service = new FizzFourBuzzSeven(repository);
        SubmissionController controller = new SubmissionControllerImpl(service);

        InputView view = controller.submit(inputNumber, userName);
        view.render();
    }

}
