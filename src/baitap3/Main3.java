/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author Hai Tran Do
 */
public class Main3 {
    public static void main(String[] args) {
        // create sinh vien IT
        SinhVienIT it = new SinhVienIT("Nguyen Van A", "CNTT", 9, 10, 10);
        // create sinh vien Biz
        SinhVienBiz biz = new SinhVienBiz("Nguyen Van B", "Biz", 5, 6);
        // create sinh vien poly tu sinh vien IT
        SinhVienPoly poly = new SinhVienIT("Nguyen Van C", "CNTT", 6, 7, 8);
        
        // xuat thong tin sinh sinh
        it.xuat();
        System.out.println("diem: " + it.getDiem());
        System.out.println("hoc luc: " + it.getHocLuc());
        
        biz.xuat();
        System.out.println("diem: " + biz.getDiem());
        System.out.println("hoc luc: " + biz.getHocLuc());
        
        poly.xuat();
        System.out.println("diem: " + poly.getDiem());
        System.out.println("hoc luc: " + poly.getHocLuc());
    }
}
