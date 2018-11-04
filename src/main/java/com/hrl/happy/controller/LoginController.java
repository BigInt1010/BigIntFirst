package com.hrl.happy.controller;

import javax.validation.Valid;

import com.hrl.happy.amdinModel.User;
import com.hrl.happy.adminService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value={"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }


    @RequestMapping(value="/registration", method = RequestMethod.GET)
    public ModelAndView registration(){
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("registration");
        return modelAndView;
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView createNewUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
        User userExists = userService.findUserByEmail(user.getEmail());
        if (userExists != null) {
            bindingResult
                    .rejectValue("email", "error.user",
                            "There is already a user registered with the email provided");
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration");
        } else {
            userService.saveUser(user);
            modelAndView.addObject("successMessage", "User has been registered successfully");
            modelAndView.addObject("user", new User());
            modelAndView.setViewName("registration");

        }
        return modelAndView;
    }

    @RequestMapping(value="/admin/home", method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User user = userService.findUserByEmail(auth.getName());
        modelAndView.addObject("userName", "Welcome " + user.getName() + " " + user.getLastName() + " (" + user.getEmail() + ")");
        modelAndView.addObject("adminMessage","Content Available Only for Users with Admin Role");
        modelAndView.setViewName("admin/home");
        return modelAndView;
    }

    @RequestMapping(value ="/dashboard")
    public String dashboard(){

        return  "dashboard";
    }
    @RequestMapping(value ="/adminlist")
    public String adminlist(){

        return  "adminlist";
    }
    @RequestMapping(value ="/addadmin")
    public String addadmin(){

        return  "add_admin";
    }
    @RequestMapping(value ="/editadmin")
    public String editadmin(){

        return  "edit_admin";
    }
    @RequestMapping(value ="/driverlist")
    public String driverlist(){

        return  "driverlist";
    }
    @RequestMapping(value ="/adddriver")
    public String adddriver(){

        return  "add_driver";
    }
    @RequestMapping(value ="/addtaxi")
    public String addtaxi(){

        return  "add_taxi";
    }
    @RequestMapping(value ="/viewdriverdocument")
    public String viewdriverdocument(){

        return  "view_driver_document";
    }
    @RequestMapping(value ="/editdriver")
    public String editdriver(){

        return  "edit_driver";
    }
    @RequestMapping(value ="/taxilist")
    public String taxilist(){

        return  "taxi_list";
    }
    @RequestMapping(value ="/rentpackage")
    public String rentpackage(){

        return  "rent_package";
    }
    @RequestMapping(value ="/login1")
    public String login1(){

        return  "login1";
    }
    @RequestMapping(value ="/viewrentpack")
    public String viewrentpack(){

        return  "view_rentpack";
    }
    @RequestMapping(value ="/addrentpackage")
    public String addrentpackage(){

        return  "add_rentpackage";
    }
    @RequestMapping(value ="/vehicletype")
    public String vehicletype(){

        return  "vehicletype";
    }
    @RequestMapping(value ="/addvehicletype")
    public String addvehicletype(){

        return  "add_vehicletype";
    }
    @RequestMapping(value ="/riderlist")
    public String riderlist(){

        return  "rider_list";
    }
    @RequestMapping(value ="/addrider")
    public String addrider(){

        return  "add_rider";
    }
    @RequestMapping(value ="/editrider")
    public String editrider(){

        return  "edit_rider";
    }
    @RequestMapping(value ="/manualbooking")
    public String manualbooking(){

        return  "manual_booking";
    }
    @RequestMapping(value ="/trip")
    public String trip(){

        return  "trip";
    }
    @RequestMapping(value ="/laterbooking")
    public String laterbooking(){

        return  "later_booking";
    }
    @RequestMapping(value ="/promocode")
    public String promocode(){

        return  "promo_code";
    }
    @RequestMapping(value ="/addpromo")
    public String addpromo(){

        return  "add_promo";
    }
    @RequestMapping(value ="/editpromocode")
    public String editpromocode(){

        return  "edit_promo_code";
    }
    @RequestMapping(value ="/heatmap")
    public String heatmap(){

        return  "heat_map";
    }
    @RequestMapping(value ="/reviews")
    public String reviews(){

        return  "reviews";
    }
    @RequestMapping(value ="/reportpayment")
    public String reportpayment(){

        return  "report_payment";
    }
    @RequestMapping(value ="/reportreferral")
    public String reportreferral(){

        return  "report_referral";
    }
    @RequestMapping(value ="/referraldetails")
    public String referraldetails(){

        return  "referral_details";
    }
    @RequestMapping(value ="/walletreport")
    public String walletreport(){

        return  "wallet_report";
    }
    @RequestMapping(value ="/reportdriverpayment")
    public String reportdriverpayment(){

        return  "report_driver_payment";
    }
    @RequestMapping(value ="/reportcancelledride")
    public String reportcancelledride(){

        return  "report_cancelled_ride";
    }
    @RequestMapping(value ="/reportdriverlog")
    public String reportdriverlog(){

        return  "report_driver_log";
    }
    @RequestMapping(value ="/reporttripacceptance")
    public String reporttripacceptance(){

        return  "report_trip_acceptance";
    }
    @RequestMapping(value ="/reportcancelledtrip")
    public String reportcancelledtrip(){

        return  "report_cancelled_trip";
    }
    @RequestMapping(value ="/reporttripvariance")
    public String reporttripvariance(){

        return  "report_trip_variance";
    }
    @RequestMapping(value ="/geofencelocation")
    public String geofencelocation(){

        return  "geo_fence_location";
    }
    @RequestMapping(value ="/geoaddlocation")
    public String geoaddlocation(){

        return  "geo_add_location";
    }
    @RequestMapping(value ="/geoeditlocation")
    public String geoeditlocation(){

        return  "geo_edit_location";
    }
    @RequestMapping(value ="/country")
    public String country(){

        return  "country";
    }
    @RequestMapping(value ="/addcountry")
    public String addcountry(){

        return  "add_country";
    }
    @RequestMapping(value ="/editcountry")
    public String editcountry(){

        return  "edit_country";
    }
    @RequestMapping(value ="/addstate")
    public String addstate(){

        return  "add_state";
    }
    @RequestMapping(value ="/state")
    public String state(){

        return  "state";
    }
    @RequestMapping(value ="/editstate")
    public String editstate(){

        return  "edit_state";
    }
    @RequestMapping(value ="/rating")
    public String rating(){

        return  "rating";
    }
    @RequestMapping(value ="/addrating")
    public String addrating(){

        return  "add_rating";
    }
    @RequestMapping(value ="/editrating")
    public String editrating(){

        return  "edit_rating";
    }
    @RequestMapping(value ="/restrictedarea")
    public String restrictedarea(){

        return  "restricted_area";
    }
    @RequestMapping(value ="/addrestricted")
    public String addrestricted(){

        return  "add_restricted";
    }
    @RequestMapping(value ="/editrestricted")
    public String editrestricted(){

        return  "edit_restricted";
    }
    @RequestMapping(value ="/locationwisefare")
    public String locationwisefare(){

        return  "location_wase_fare";
    }
    @RequestMapping(value ="/addlocationfare")
    public String addlocationfare(){

        return  "add_location_fare";
    }
    @RequestMapping(value ="/editlocationfare")
    public String editlocationfare(){

        return  "edit_location_fare";
    }
    @RequestMapping(value ="/generalsettings")
    public String generalsettings(){

        return  "general_settings";
    }
    @RequestMapping(value ="/emailtemplate")
    public String emailtemplate(){

        return  "email_template";
    }
    @RequestMapping(value ="/smstemplate")
    public String smstemplate(){

        return  "sms_template";
    }
    @RequestMapping(value ="/editemailtemplate")
    public String editemailtemplate(){

        return  "edit_email_temp";
    }
    @RequestMapping(value ="/editsmstemplate")
    public String editsmstemplate(){

        return  "edit_sms_temp";
    }
    @RequestMapping(value ="/managedocument")
    public String managedocument(){

        return  "manage_document";
    }
    @RequestMapping(value ="/addmanagedocument")
    public String addmanagedocument(){

        return  "add_manage_document";
    }
    @RequestMapping(value ="/editmanagedocument")
    public String editmanagedocument(){

        return  "edit_manage_document";
    }
    @RequestMapping(value ="/curency")
    public String curency(){

        return  "currencye";
    }
    @RequestMapping(value ="/seosettings")
    public String seosettings(){

        return  "seo_settings";
    }
    @RequestMapping(value ="/editseo")
    public String editseo(){

        return  "edit_seo";
    }
    @RequestMapping(value ="/pages")
    public String pages(){

        return  "pages";
    }
    @RequestMapping(value ="/editpages")
    public String editpages(){

        return  "edit_pages";
    }
    @RequestMapping(value ="/homepageedit")
    public String homepageedit(){

        return  "home_page";
    }
    @RequestMapping(value ="/edithomepage")
    public String edithomepage(){

        return  "edit_homepage";
    }
    @RequestMapping(value ="/carmake")
    public String carmake(){

        return  "car_make";
    }
    @RequestMapping(value ="/addcarmake")
    public String addcarmake(){

        return  "add_car_make";
    }
    @RequestMapping(value ="/editcarmake")
    public String editcarmake(){

        return  "edit_car_make";
    }
    @RequestMapping(value ="/carmodel")
    public String carmodel(){

        return  "car_model";
    }
    @RequestMapping(value ="/addcarmodel")
    public String addcarmodel(){

        return  "add_car_model";
    }
    @RequestMapping(value ="/editcarmodel")
    public String editcarmodel(){

        return  "edit_car_model";
    }
    @RequestMapping(value ="/faq")
    public String faq(){

        return  "faq";
    }
    @RequestMapping(value ="/addfaq")
    public String addfaq(){

        return  "add_faq";
    }
    @RequestMapping(value ="/editfaq")
    public String editfaq(){

        return  "edit_faq";
    }
    @RequestMapping(value ="/faqcatogory")
    public String faqcatogory(){

        return  "faq_catogory";
    }
    @RequestMapping(value ="/addfaqcatogory")
    public String addfaqcatogory(){

        return  "add_faq_catogory";
    }
    @RequestMapping(value ="/editfaqcatogory")
    public String editfaqcatogory(){

        return  "edit_faq_catogory";
    }
    @RequestMapping(value ="/viewadmin")
    public String viewadmin(){

        return  "view_admin";
    }
    @RequestMapping(value ="/viewdriver")
    public String viewdriver(){

        return  "view_driver";
    }
    @RequestMapping(value ="/viewrent")
    public String viewrent(){

        return  "view_rent";
    }
    @RequestMapping(value ="/viewvehicletype")
    public String viewvehicletype(){

        return  "view_vehicle_type";
    }
    @RequestMapping(value ="/viewrider")
    public String viewrider(){

        return  "view_rider";
    }
    @RequestMapping(value ="/viewtrip")
    public String viewtrip(){

        return  "view_trip";
    }
    @RequestMapping(value ="/viewlaterbooking")
    public String viewlaterbooking(){

        return  "view_later_booking";
    }
    @RequestMapping(value ="/viewpromocode")
    public String viewpromocode(){

        return  "view_promo_code";
    }
    @RequestMapping(value ="/viewrating")
    public String viewrating(){

        return  "view_rating";
    }
    @RequestMapping(value ="/viewreview")
    public String viewreview(){

        return  "view_review";
    }
    @RequestMapping(value ="/viewreportpayment")
    public String viewreportpayment(){

        return  "view_report_payment";
    }
    @RequestMapping(value ="/viewdriverpayment")
    public String viewdriverpayment(){

        return  "view_driver_payment";
    }
    @RequestMapping(value ="/viewreportcanceledride")
    public String viewreportcanceledride(){

        return  "view_report_canceled_ride";
    }
    @RequestMapping(value ="/viewreportdriverlog")
    public String viewreportdriverlog(){

        return  "view_report_driver_log";
    }
    @RequestMapping(value ="/viewcanceledtrip")
    public String viewcanceledtrip(){

        return  "view_canceled_trip";
    }
    @RequestMapping(value ="/viewtripacceptance")
    public String viewtripacceptance(){

        return  "view_trip_acceptance";
    }
    @RequestMapping(value ="/viewtripvariance")
    public String viewtripvariance(){

        return  "view_trip_variance";
    }
    @RequestMapping(value ="/viewgeofencelocation")
    public String viewgeofencelocation(){

        return  "view_geo_fence_location";
    }
    @RequestMapping(value ="/viewrestrictedarea")
    public String viewrestrictedarea(){

        return  "view_restricted_area";
    }
    @RequestMapping(value ="/viewlocationfare")
    public String viewlocationfare(){

        return  "view_location_fare";
    }
    @RequestMapping(value ="/editvehicletype")
    public String editvehicletype(){

        return  "edit_vehicletype";
    }
    @RequestMapping(value ="/editrentpackage")
    public String editrentpackage(){

        return  "edit_rentpack";
    }
    @RequestMapping(value ="/invoice")
    public String invoice(){

        return  "invoice";
    }
}
