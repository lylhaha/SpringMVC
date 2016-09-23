package controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * 多种控制
 * Created by user on 2016/9/23.
 */
public class FormMutiController extends MultiActionController {
    private Logger logger=Logger.getLogger(this.getClass().getName());
    private String viewPage;

    public String getViewPage() {
        return viewPage;
    }

    public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }

    public ModelAndView insert(HttpServletRequest request,HttpServletResponse response){

        String helloWord=request.getParameter("msg");
        Map model=new HashMap();
        model.put("helloWord","insert"+helloWord);
        return new ModelAndView(getViewPage(),model);
    }
    public ModelAndView update(HttpServletRequest request,HttpServletResponse response){
        String helloWord=request.getParameter("msg");
        Map model=new HashMap();
        model.put("helloWord","update"+helloWord);


            int i=1/0;





        return new ModelAndView(getViewPage(),model);
    }
    public ModelAndView delete(HttpServletRequest request,HttpServletResponse response){
        String helloWord=request.getParameter("msg");
        Map model=new HashMap();
        model.put("helloWord","update"+helloWord);
        return new ModelAndView(getViewPage(),model);
    }
}
