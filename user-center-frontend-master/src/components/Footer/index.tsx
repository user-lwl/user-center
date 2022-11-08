import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';
// import {PLANET_LINK} from "@/constants";

const Footer: React.FC = () => {
  const defaultMessage = 'user-lwl';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'github',
          title: <><GithubOutlined/> user-lwl GitHub</>,
          href: 'https://github.com/user-lwl',
          blankTarget: true,
        },

      ]}
    />
  );
};

export default Footer;
