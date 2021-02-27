package exam03retake;

import java.util.ArrayList;
import java.util.List;

public class MailBox {

    private List<Mail> mails = new ArrayList<>();

    public MailBox() {

    }

    public List<Mail> getMails() {
        return mails;
    }

    public MailBox(List<Mail> mails) {
        this.mails = mails;
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public List<Mail> findByCriteria(String criteria) {
        List<Mail> result = new ArrayList<>();
        String compare;
        if (criteria.length() > 2) {
            compare = criteria.substring(0, 3);
        } else compare = criteria;
        switch (compare) {

            case "fro":
                for (Mail x : mails) {
                    if (x.getFrom().getEmail().equals(criteria.substring(5))) {
                        result.add(x);
                    }

                }
                break;
            case "to:":
                for (Mail x : mails) {
                    for (Contact y : x.getTo())
                        if (y.getName().equals(criteria.substring(3))) {
                            result.add(x);
                        }

                }
                break;
            default:
                for (Mail x : mails) {
                    System.out.println(x.getMessage());
                    if (x.getMessage().contains(criteria) || (x.getSubject().contains(criteria))) {
                        result.add(x);
                    }
                }

        }
        return result;
    }
}





