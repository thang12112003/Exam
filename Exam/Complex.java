package Exam;
import java.util.Scanner;

public class Complex {
    public Double realPart;
    public Double virtualPart;

    public Double getRealPart() {
        return realPart;
    }

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public Double getVirtualPart() {
        return virtualPart;
    }

    public void setVirtualPart(Double virtualPart) {
        this.virtualPart = virtualPart;
    }
    public Complex(){
        realPart = 0.0;
        virtualPart = 0.0;
    }
    // Ham khoi tao co doi so
    public Complex(double realPart, double virtualPart) {
        this.realPart = realPart;
        this.virtualPart = virtualPart;
    }

    // Ham nhap so phuc
    public void nhap(Scanner sc) {
        System.out.print("\tNhap vao phan thuc: ");
        realPart = sc.nextDouble();
        System.out.print("\tNhap vao phan ao: ");
        virtualPart = sc.nextDouble();
    }

    // Ham hien thi so phuc
    public void hienThi() {
        if (virtualPart < 0) {
            System.out.println(realPart + " - " + Math.abs(virtualPart) + "*i");
        } else {
            System.out.println(realPart + " + " + virtualPart + "*i");
        }
    }

    // Ham cong 2 so phuc
    public Complex congSP(Complex sp2) {
        double thuc = realPart + sp2.realPart;
        double ao = virtualPart + sp2.virtualPart;
        return new Complex(thuc, ao);
    }

    // Ham tru 2 so phuc
    public Complex truSP(Complex sp2) {
        double thuc = realPart - sp2.realPart;
        double ao = virtualPart - sp2.virtualPart;
        return new Complex(thuc, ao);
    }

    // Ham nhan 2 so phuc
    public Complex nhanSP(Complex sp2) {
        double thuc = realPart * sp2.realPart - virtualPart * sp2.virtualPart;
        double ao = realPart * sp2.virtualPart + sp2.virtualPart * virtualPart;
        return new Complex(thuc, ao);
    }

    // Ham chia 2 so phuc
    public Complex chiaSP(Complex sp2) {
        double thuc = (realPart * sp2.realPart + virtualPart * sp2.virtualPart) / (sp2.realPart * sp2.realPart + sp2.virtualPart * sp2.virtualPart);
        double ao = (sp2.realPart * virtualPart - realPart * sp2.virtualPart) / (sp2.realPart * sp2.virtualPart + sp2.virtualPart * sp2.virtualPart);
        return new Complex(thuc, ao);
    }
}
